# CustomNameplates 3.0.45

> 原版 CustomNameplates 源码快照（官方 main 分支，版本 3.0.45），附针对 **Minecraft 1.21.5+ / Paper / Java 25** 编译好的二进制。

本项目是 [CustomNameplates](https://www.spigotmc.org/) 的源码镜像与编译产物备份，用于在本服（Paper 26.1.2 / MC 1.21.5+ / Java 25）上获得与新版本 NMS 兼容的运行版本。

**原作者与版权归 CustomNameplates 原作者所有，本项目遵循其 GNU General Public License v3.0 协议开源**（详见 [LICENSE](LICENSE)）。此处未对插件源码作任何功能性修改，仅提供源码快照与编译版本。

## 为什么有这个仓库

官方发布的 3.0.19 等旧版本在 Minecraft 1.21.5+ 上因 NMS 与内部 API 变更而无法启动（如 `Component$Serializer` 移除、`only supports 1.19.4+`、Cloud 命令库报错等）。本仓库保存了官方 main 分支 3.0.45 的源码，并编译出可在 1.21.5+ / Java 25 正常运行的 jar，方便备份与复现构建。

## 内容

| 路径 | 说明 |
| --- | --- |
| `api/`、`backend/`、`platforms/` | 官方 3.0.45 完整源码（Gradle 多模块） |
| `releases/CustomNameplates-3.0.45.jar` | 编译好的插件本体，可直接放入 `plugins/` |
| `LICENSE` | GNU GPL v3.0（源码文件头中亦声明） |

## 安装

把 `releases/CustomNameplates-3.0.45.jar` 放入服务端 `plugins/` 目录，重启服务器即可。首次启动会在 `plugins/CustomNameplates/` 下生成配置。

> 依赖：需要 Java 21+（本服使用 Java 25）。服务器资源包功能按需在 `config.yml` 中开启。

## 自行构建

源码为 Gradle Kotlin DSL 多模块工程（`api` / `backend` / `platforms:bukkit`）。使用 JDK 21+ 执行：

```bash
./gradlew shadowJar
```

构建产物在各模块的 `build/libs/` 下。首次构建需能访问 PaperMC / Maven Central 仓库。

## 协议

以 [GNU General Public License v3.0](LICENSE) 开源。商标、名称及原作品版权归原作者所有；本仓库仅为源码镜像与编译备份，不代表官方。
