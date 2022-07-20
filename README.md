# Mikoto-Pixiv-Core

[![wakatime](https://wakatime.com/badge/user/1881dd28-2018-456f-8c50-e897127472e4/project/af7838fd-d70b-4eea-a108-a2fff9cf5f17.svg)](https://wakatime.com/badge/user/1881dd28-2018-456f-8c50-e897127472e4/project/af7838fd-d70b-4eea-a108-a2fff9cf5f17)
[![Java CI](https://github.com/mikoto-tech/pixiv-core/actions/workflows/ci.yaml/badge.svg)](https://github.com/mikoto-tech/pixiv-core/actions/workflows/ci.yaml)
[![License](https://img.shields.io/github/license/mikoto-tech/pixiv-core?color=4D7A97)](https://www.gnu.org/licenses/agpl-3.0.html)
[![GitHub release](https://img.shields.io/github/release/mikoto-tech/pixiv-core)](https://github.com/mikoto-tech/pixiv-core/releases)

## 本仓库是为了

- 提供统一标准类（诸如model、util）
- 通过connector与client将各个部分以Http的方式连接起来

## 如何使用?

使用Pixiv-Core的方法很简单 只需将其作为您项目的依赖

#### Gradle

```groovy
repositories {
    maven {
        url = uri("https://raw.githubusercontent.com/mikoto-tech/maven-repository/master/")
    }
}
```

#### Maven

```xml
<repositories>
    <repository>
        <id>mikoto-tech-maven-repository</id>
        <url>https://raw.githubusercontent.com/mikoto-tech/maven-repository/master/</url>
    </repository>
</repositories>
```

## 开发文档

Waiting...

## 声明

### 一切开发旨在学习，请勿用于非法用途

- `Mikoto-Pixiv` 是完全免费且开放源代码的软件，仅供学习和娱乐用途使用
- `Mikoto-Pixiv` 不会通过任何方式强制收取费用，或对使用者提出物质条件
- `Mikoto-Pixiv` 由整个开源社区维护，并不是属于某个个体的作品，所有贡献者都享有其作品的著作权。

### 许可证

    Copyright (C) 2021-2021 Mikoto and contributors.

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

`Mikoto-Pixiv` 采用 `AGPLv3` 协议开源。为了整个社区的良性发展，我们**强烈建议**您做到以下几点：

- **间接接触（包括但不限于使用 `Http API` 或 跨进程技术）到 `Mikoto-Pixiv` 的软件使用 `AGPLv3` 开源**
- **不鼓励，不支持一切商业使用**

鉴于项目的特殊性，开发团队可能在任何时间**停止更新**或**删除项目**。
