package cn.xiaofuge.mall.service;

import cn.xiaofuge.mall.domain.Product;
import java.math.BigDecimal;
import java.util.List;

final class MallData {
    private MallData() {
    }

    static List<Product> products() {
        return List.of(
                product("p001", "Nova X14 轻薄笔记本", "NovaLab", "笔记本", "💻", "通勤会议双在线",
                        "14 英寸 2.8K 120Hz 屏，标压 R7 处理器，1.19kg 镁铝合金机身，支持 65W PD 充电。", "5999", "6799", 24, 4.8,
                        List.of("轻薄本", "办公", "高色域"), "差旅办公 12 小时不断电。",
                        "NovaLab 体验中心", "两年上门 · 90 天只换不修"),
                product("p002", "Sonic Air 4 降噪耳机", "SonicWave", "音频", "🎧", "把地铁调成静音",
                        "42dB 混合主动降噪，10 分钟快充听 3 小时，入耳记忆棉与双设备连接。", "749", "899", 58, 4.9,
                        List.of("降噪", "通勤", "蓝牙"), "早晨通勤把噪声压到适合专注的音量。",
                        "SonicWave Audio Lab", "两年质保 · 7 天试听"),
                product("p003", "Pixel View 27 显示器", "PixelView", "显示器", "🖥️", "代码和影调都更干净",
                        "27 英寸 4K IPS Black，HDR600，Type-C 90W 反向供电，出厂校色 Delta E<2。", "2899", "3299", 16, 4.7,
                        List.of("4K", "HDR", "Type-C"), "一根线连接笔记本，桌面更整洁。",
                        "PixelView Studio", "三年质保 · 无亮点保障"),
                product("p004", "Orbit Pad Pro 平板", "Orbit", "平板", "📱", "手写、分屏、课堂三合一",
                        "11 英寸 144Hz 护眼屏，磁吸键盘和 4096 级压感笔，四扬声器环绕声。", "2399", "2699", 33, 4.6,
                        List.of("手写", "学习", "分屏"), "下午课堂笔记，晚上改成周报初稿。",
                        "Orbit Digital", "一年碎屏险 · 30 天试学"),
                product("p005", "Lens One 微单相机", "Lens One", "影像", "📷", "夜景也能保留情绪",
                        "2600 万像素 APS-C 画幅，五轴防抖，F1.4 定焦套机，可翻转触屏。", "6499", "7299", 9, 4.8,
                        List.of("微单", "夜景", "Vlog"), "晚风市集手持拍摄也稳。",
                        "Lens One Imaging", "两年质保 · 快门 15 万次"),
                product("p006", "Aero Fit 智能手表", "AeroFit", "穿戴", "⌚", "训练恢复都看得见",
                        "1.85 英寸 AMOLED，双频 GPS，血氧与 HRV 监测，14 天续航。", "1299", "1499", 47, 4.7,
                        List.of("运动", "GPS", "长续航"), "晨跑配速与恢复建议一次呈现。",
                        "AeroFit Health", "一年保修 · 表带 30 天换新"),
                product("p007", "Volt Go 100W 充电器", "VoltGo", "配件", "🔌", "一个充电头喂饱桌面",
                        "2C1A 100W GaN III，折叠插脚，支持笔记本、平板、手机同时快充。", "299", "349", 82, 4.8,
                        List.of("GaN", "快充", "差旅"), "出门只带一个电源适配器。",
                        "VoltGo Power", "18 个月换新 · 温控保护"),
                product("p008", "Stream Cube 机械键盘", "StreamCube", "外设", "⌨️", "敲代码像打节拍",
                        "75% 配列，Gasket 结构，佳达隆红 Pro 轴，三模连接和 RGB 白光。", "499", "599", 41, 4.9,
                        List.of("机械键盘", "热插拔", "三模"), "下班后切换到写作模式也顺手。",
                        "StreamCube Lab", "两年质保 · 轴体终身保修"),
                product("p009", "Echo Beam 投影仪", "EchoBeam", "影音", "🎥", "客厅秒变私人影院",
                        "1080P 物理分辨率，900 ANSI 流明，自动对焦和梯形校正，内置双 8W 音箱。", "3299", "3799", 18, 4.6,
                        List.of("投影", "大屏", "影院"), "周五晚上直接开始家庭观影。",
                        "EchoBeam Cinema", "三年质保 · 光机两年保修"),
                product("p010", "Nimbus SSD 2TB 移动硬盘", "Nimbus", "存储", "💾", "素材库随身带",
                        "USB4 40Gbps，读取 3100MB/s，铝合金散热壳，支持 4K 素材直剪。", "1299", "1499", 36, 4.8,
                        List.of("SSD", "USB4", "视频剪辑"), "外拍素材现场回传更快。",
                        "Nimbus Storage", "五年质保 · 数据恢复服务"),
                product("p011", "Pulse Mini 游戏主机", "Pulse", "游戏", "🎮", "客厅聚会一键开赛",
                        "定制 8 核处理器，16GB 内存，1TB SSD，支持 4K60 与本地双人游戏。", "3999", "4499", 12, 4.7,
                        List.of("主机", "4K60", "双人"), "周末和朋友连玩两局最合适。",
                        "Pulse Interactive", "两年整机保修 · 手柄一年"),
                product("p012", "Clear Cam 4K 会议摄像头", "ClearCam", "办公", "🎥", "远程会议更像面对面",
                        "4K HDR，双麦克风阵列，AI 取景与低光增强，支持隐私遮罩。", "899", "1099", 54, 4.5,
                        List.of("会议", "AI 取景", "低光"), "晚上汇报也能保持清晰画面。",
                        "ClearCam Office", "两年质保 · 固件长期更新")
        );
    }

    private static Product product(
            String id, String name, String brand, String category, String emoji,
            String tagline, String description, String price, String originalPrice, int stock, double rating,
            List<String> tags, String scenarioTip, String companyName, String afterSalesPolicy
    ) {
        return new Product(id, name, brand, category, emoji, tagline, description,
                new BigDecimal(price), new BigDecimal(originalPrice), stock, rating, tags, scenarioTip,
                companyName, afterSalesPolicy);
    }
}
