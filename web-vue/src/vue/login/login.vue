<template>
   <div v-show="model" class="login-form">
    <button class="close-button" @click="toggleLogin">×</button>
    <h2>Login</h2>
    <form @submit.prevent="login">
      <input type="text" v-model="username" placeholder="账户名" required >
      <input type="password" v-model="password" placeholder="密码" required >
      <button type="submit">登录</button>
      <button type="reset">重置</button>
      <button type="button" @click="toggleEnroll">注册</button>
    </form>
  </div>
</template>

<script setup>
import { ref} from 'vue';
import axios from 'axios';
function matchObjects(objects, data1, data2) {
       return objects.some(obj => obj.username === data1 && obj.password === data2);
   }
const username = ref('');
const password = ref('');
const model = defineModel(
  )
const toggleLogin = () => {

  model.value = 0;
};
const login = () => {
  // 添加登录逻辑
  axios.get('http://localhost:3000/users', {
              params: {
                username: username.value,
                password: password.value
              }
            })
      .then(response => {
          if (matchObjects(response.data, username.value, password.value)) {
              alert("登陆成功");
              model.value = 0;
          } else {
              alert("登陆失败");
          }            
        })
      .catch(error => {
          console.error('登录请求出错', error);
        });
};

const toggleEnroll = () => {
  // 添加切换注册页面逻辑
  model.value= 2 ;
};
</script>
<style>
@import url('../../css/01.css');
</style>