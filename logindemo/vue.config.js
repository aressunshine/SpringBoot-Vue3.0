module.exports = {
    outputDir: 'dist',
    devServer: {
        /*自动打开浏览器*/
        open: true,
        //设置为仅本机能访问，'0.0.0.0'为所有地址能访问
        //这个地址是前端页面地址
        host: 'localhost',
        //前端页面端口
        port: 8081,
        /*是否为https请求：否*/
        https: false,
        proxy: {
            '/': {
                ws: false,
                target: 'http://localhost:8080',
                changeOrigin: true,
                pathRewrite: {
                    '^/': ''
                }
            }
        }
        /*proxy: {
            '/api': {
                //http请求时ws设置为false
                ws: false,
                target: 'http://localhost:8080',//后台接口地址
                changeOrigin: true,//允许跨域
                pathRewrite: {
                    //axios请求的时候直接用 /api 代替了后台ip地址，比如我要登录用户
                    //访问地址localhost:8080/login，可以用/api/login代替
                    '^/api': ''
                }
            }
        }*/
    }
}
