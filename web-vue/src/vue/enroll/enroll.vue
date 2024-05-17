<template>
  <div v-show="model" class="login-form">
   <button class="close-button" @click="toggleLogin">×</button>
   <h2>register</h2>
   <form @submit.prevent="enroll">
     <input type="text" v-model="username" placeholder="账户名" required >
     <input type="password" v-model="password1" placeholder="密码" required >
     <input type="password" v-model="password2" placeholder="再次确认密码" required >
     <button type="submit">提交</button>
     <button type="reset">重置</button>
     <button type="button" @click="toggleEnroll">返回</button>
   </form>
 </div>
</template>

<script setup>
import { ref} from 'vue';
import axios from 'axios';
function maobj(obj,d1)
   {
    return obj.some(o => o.username === d1);
   }
const model = defineModel()
const username = ref('');
const password1 = ref('');
const password2 = ref('');

const toggleLogin = () => {

  model.value = 0;
};
const enroll = () => {
 axios.get('http://localhost:3000/users', {
              params: {
                username: username.value,
              }
            })
            .then(response => {
              if(maobj(response.data,username.value))
              {
                alert("账号已被注册");
              }
              else{
                 if(password1.value === password2.value)
                 {
                  axios.post('http://localhost:3000/users',{
                    username: username.value,
                    password: password1.value})
                    .then(response => {
                      alert("注册成功")
                       model.value = 0;
                    })
                    .catch(error => {
                      console.error('登录请求出错', error);
                    });
                 }
                 else
                 {
                  alert("两次密码不同！")
                 }
              }
            })
};

const toggleEnroll = () => {
 // 添加切换注册页面逻辑
 model.value= 1;
};
</script>
<style>
@import url('../../css/01.css');
</style>