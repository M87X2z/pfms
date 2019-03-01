## 简介
pfms，中文名称：私人文件管理系统，它是基于 [EasyFS](https://gitee.com/whvse/easy-fs) 二次升级改造，
改造后更方便灵活、文件以及文件夹的管理、定时分享文件，
轻量级文件服务器，支持缩略图，下载支持中文名，不依赖其它容器，可独立部署，
使用Java语言、SpringBoot框架、Thymeleaf模板引擎、Layer前端、Java内存缓存开发.

## 平台支持
1. Windows
2. Linux

## 预览
![image](https://raw.githubusercontent.com/MrCinco/images/master/pfms/01.png)
![image](https://raw.githubusercontent.com/MrCinco/images/master/pfms/02.png)
![image](https://raw.githubusercontent.com/MrCinco/images/master/pfms/03.png)
![image](https://raw.githubusercontent.com/MrCinco/images/master/pfms/04.png)
![image](https://raw.githubusercontent.com/MrCinco/images/master/pfms/05.png)
![image](https://raw.githubusercontent.com/MrCinco/images/master/pfms/06.png)
![image](https://raw.githubusercontent.com/MrCinco/images/master/pfms/07.png)
![image](https://raw.githubusercontent.com/MrCinco/images/master/pfms/08.png)

## 使用场景
私人文件在线管理，主要功能有：  
文件上传、下载、查看、删除、重命名、新建文件夹、定时分享文件等...

## Linux独立部署
0. 本地修改配置打包，上传jar包到linux服务器
1. 运行命令: nohup java -jar fms-1.0.jar &
2. 访问：http://ip:8081
3. 你也可以直接使用IDEA导入源码运行

## 使用指南
配置文件中以下两个参数标识管理员账号和密码：
> admin.uname=root  
  admin.pwd=123  
  
PS: 如果是图片、音频、视频、pdf、网页、文本类型的文件会在浏览器直接打开，其他类型弹出下载框。

## 服务器参数配置
fs.dir配置为上传到硬盘的指定文件夹中，并且会生成图片缩略图。

## 其他可选参数
> fs.dir：文件上传位置  
fs.uuidName：文件是否使用uuid命名  
fs.useSm：文件是否生成缩略图  
fs.useNginx：文件是否使用nginx做转发  
fs.nginxUrl：nginx服务器地址
