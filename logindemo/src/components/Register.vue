<template>
    <div>
        <form v-on:submit.prevent="register()">
            <h1>注册</h1>
            <input type="text" v-model="user.username" placeholder="请输入5-16位用户名">
            <input type="password" v-model="user.password" placeholder="请输入5-16位密码">
            <button>注册</button>
        </form>
    </div>
</template>

<script>
    export default {
        name: "Register",
        data() {
            return {
                user: {username: '', password: ''}
            }
        },
        methods: {
            register() {
                this.$axios.post('/register', this.user)
                    .then(response => {
                        this.responseResult = JSON.stringify(response.data)
                        if (response.data.code == 200) {
                            alert("注册成功，跳转到登录页面！");
                            this.$router.replace({path: '/login'});
                        }
                    })
            }
        }
    }
</script>

<style type="text/css">
    body {
        margin: 0;
        padding: 0;
        background: #487eb0;
    }

    div {
        width: 300px;
        padding: 20px;
        text-align: center;
        margin: 0px auto; /*水平居中*/
        top: 100%;
        left: 100%;
    }

    h1 {
        margin-top: 100px;
        color: #ffffff;
        font-size: 40px;
    }

    input {
        display: block;
        width: 100%;
        padding: 0 16px;
        height: 44px;
        text-align: center;
        box-sizing: border-box;
        outline: none;
        border: none;
        font-family: "montserrat", sans-serif;
        margin: 4px;
        background: rgba(255, 255, 255, 5);
        border-radius: 6px;
    }

    button {
        width: 120px;
        height: 40px;
        margin-top: 10px;
        margin-bottom: 10px;
        background: #920eff;
        color: #fff;
        border-radius: 44px;
        cursor: pointer;
        transition: 0.8s;
    }
</style>
