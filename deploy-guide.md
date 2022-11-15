#Flowable服务部署手册

-----

## 通用部分
1. 复制`flowable-0.0.1-SNAPSHOT.jar`文件到服务器上。
2. 使用解压缩工具从`flowable-0.0.1-SNAPSHOT.jar`中解压出`BOOT-INF\classes\application-prod.yml`文件，并修改其中关于`url`的部分为可以访问的地址。
3. 将修改后的`application-prod.yml`添加到`jar`包中替换原文件。

## windows server

1. 安装`java`。
2. 打开`nssm.exe`工具所在目录。
3. 打开命令行工具打开该目录，并输入命令：`./nssm.exe install`
4. 在弹出的对话框中输入以下字符：
    * Path - `java安装目录/bin`
    * Startup directory - `java.exe`
    * Arguments - `-jar flowable-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod`
    * Service name - `Hd.Java.Flowable`
5. 点击`Install service` 按钮安装服务。
6. 打开`任务管理器`切换至`服务`选项卡中，找到`Hd.Java.Flowable`服务，`右键点击`后从菜单中选择`启动`即可运行服务。
7. 打开`服务`，将`Hd.Java.Flowable`服务设置为`自动`，即可设置服务为开机自启动。

## ubuntu
1. 安装`java`。
2. 复制`service.sh`到相同目录下。
3. 通过`sh service.sh start`启动服务。
4. `service.sh`可用命令如下:
    * `status` - 查询服务的运行状态及pid
    * `start` - 启动服务
    * `stop` - 停止服务
    * `restart` - 重启服务
5. 开机自启动可将第3条中的命令添加到自启动服务中即可。

