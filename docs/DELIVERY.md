# Digital Mall 交付验收

## 交付物

| 项目 | 状态 | 说明 |
|---|---|---|
| 业务应用 | ✅ | Spring Boot 3.3.2 + 原生前端 |
| DSH 插件 | ✅ | `digital-mall-assistant`，5 个工具 |
| README | ✅ | 功能、地址、架构、体验流程、简历、面试要点 |
| 设计文档 | ✅ | `docs/DESIGN.md` |
| 运行截图 | ✅ | `docs/images/home.png`、`docs/images/product-detail.png`、`docs/images/assistant-panel.png` |

## 自动化验证

### 构建

```bash
mvn clean package -DskipTests
```

结果：`BUILD SUCCESS`。

### 服务探活

```bash
curl --noproxy '*' -o /dev/null -w '%{http_code}' http://127.0.0.1:8090
curl --noproxy '*' -o /dev/null -w '%{http_code}' http://127.0.0.1:18080
```

结果：两个地址均返回 `200`。

### 插件状态

```bash
curl --noproxy '*' http://127.0.0.1:8090/api/harness/plugins
```

结果：

```text
digital-mall-assistant ACTIVE
```

## 工具实测

| 工具 | 测试问题 | 结果 |
|---|---|---|
| `search_products` | 推荐两款适合通勤的数码产品，并说明为什么。 | 返回 Sonic Air 4 与 Nova X14，价格/库存来自商城 API |
| `get_product` | 查一下 p002 的商品详情。 | 返回降噪、续航、价格、库存、评分和服务保障 |
| `query_orders` | [商城上下文] customerId=customer-1<br/>查一下我的订单列表，并总结状态。 | 返回 1 笔已支付订单和金额汇总 |
| `get_order` | 服务凭证模式请求订单明细。 | 返回订单、商品、金额、地址、支付方式 |
| `query_logistics` | [商城上下文] customerId=customer-1<br/>帮我查一下订单 MD20260923001025 的物流。 | 返回承运商、轨迹、预计送达、取件码 |

## API 链路

- 登录：`POST /api/auth/login`，`customer-1 / 123456` 成功。
- 加购：`POST /api/mall/cart/items`，`p001 × 1` 成功。
- 下单：`POST /api/mall/orders`，生成订单号。
- 支付：`POST /api/mall/orders/{orderNo}/payment`，状态变为 `PAID`。
- 订单详情：`GET /api/mall/orders/{orderNo}?customerId=customer-1`，服务凭证模式成功。
- 物流：`GET /api/mall/orders/{orderNo}/logistics?customerId=customer-1`，返回 5 个节点。

## 已知限制

1. 数据保存在内存中，重启商城后会还原种子状态，已下单的数据不保留。
2. 支付为模拟支付，不产生真实资金流。
3. 物流为虚拟履约，不接真实快递公司。
4. 服务进程可能被环境回收；README 中已给出重启命令。
