# CampusInnoCoin NFT 系统

## 项目简介
本项目为基于 Spring Boot 的 NFT 数字藏品系统，采用 Maven 多模块架构，包含运营后台、APP 接口、后端业务逻辑模块及前端 uniapp 项目。支持多平台部署，适合校园创新币等数字资产场景。

## 环境要求
- JDK 1.8 及以上
- MySQL 5.7
- Redis（任意版本）
- 推荐开发工具：IntelliJ IDEA、Eclipse、VS Code
- Lombok 插件（需在开发工具中安装）

## 目录结构
```
nft_last/
├── nft-admin/         # 运营后台模块
├── nft-member/        # APP 端接口模块
├── nft-biz/           # 后端业务逻辑模块
├── nft-member-front/  # 前端 uniapp 项目
├── nft.sql            # 数据库初始化脚本
├── README.md          # 项目说明文档
└── ...
```

## 快速开始
1. **获取代码**
   - 克隆仓库：
     ```bash
     git clone https://github.com/Zbo1now/CampusInnoCoin.git
     ```
   - 或下载源码后放在同一目录下。

2. **数据库初始化**
   - 使用数据库管理工具（如 Navicat）创建名为 `nft` 的数据库。
   - 执行 `nft.sql` 脚本，确保有创建视图权限。

3. **配置数据库连接**
   - 在各模块的 `application.yml` 文件中，修改 MySQL 账号和密码。

4. **启动后端服务**
   - 进入各模块，找到以 `Application` 结尾的 Java 文件，直接运行即可。
   - 本地运行成功后，可将打包好的 jar 文件上传服务器，使用 `java -jar xxx.jar` 启动。

5. **运营后台登录**
   - 访问：`http://你的IP:端口/page/login`
   - 默认账号/密码：`admin/123`

## 前端 uniapp 项目启动
1. 用 HBuilderX 导入 `nft-member-front` 目录。
2. 打开 `store/index.js`，修改 `baseUrl` 为后端接口地址。
3. 可用 HBuilderX 打包为 APP 或 H5。

## GitHub 关联与常用操作
- 查看当前分支：`git branch`
- 查看远程仓库：`git remote -v`
- 推送更改：`git add . && git commit -m "描述" && git push origin main`
- 拉取远程：`git pull origin main`

## VS Code 配置建议
- 安装 Java Extension Pack
- 配置 JDK 路径（`java.home`）
- 安装 Git 和 GitHub Pull Requests and Issues 扩展

## 常见问题
- 用户头像上传路径需在运营后台“系统设置”中配置为服务器可读写目录。
- 数据库需有创建视图权限。
- 若遇到依赖问题，请检查 Lombok 插件是否安装。

## 联系方式
如有问题可通过 GitHub Issues 反馈。

---

原始说明：
环境要求：jdk1.8或以上，mysql5.7，redis随便一个版本
nft系统是maven模块化项目,用的是spring boot框架
拿到代码后创建一个目录，把代码放在同一个目录下面，然后导入项目到你的开发工具(idea或eclipse)
项目用到了lombok插件，你的开发工具需要安装这个插件
1.数据库创建一个nft的库，用你的数据库管理工具,如navicat,执行nft.sql这个文件的内容,注意有视图要创建，数据库必须要有创建视图的权限
2.可在项目文件application.yml文件修改配置的mysql密码
3.nft-admin,nft-member,nft-biz分别是运营后台，app端接口，后端业务逻辑模块
3.找到application类名结未的java文件，直接启动即可
4.部署到线上服务器：java是跨平台的，本地能跑起来，放到服务器也是一样需要安装这里环境，装好环境好把打包好的jar文件上传到服务器，然后启动即可



启动完成之后，运营后台的登录页是你的ip加端口加上/page/login，默认账号密码是admin/123


---uniapp项目启动教程
1.把nft-member-front导入到hbuilderx，找到store目录下的index.js文件
2.找到baseUrl变量，修改为app接口的地址即可
3.可在hbuilderx工具直接打包成为app，亦可打包为h5发布


注意事项：
用户头像是上传到服务器上面的，需要改运营后台的系统功能调控的系统设置，里面有个图片资源存放目录，改成你服务器上面已存在正常读写的目录即可