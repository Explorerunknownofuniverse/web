<template>
   <div class="add">
      <div class="overlay" v-show="show">
         <login v-model="showOverlay" v-if="showlogin"/>
         <enroll v-model="showOverlay" v-if="showenroll"/>
      </div>
      <hea v-model="showOverlay" />
      <bann/>
      <feature/>
      <foot/>
   </div>
   
</template>

<script setup>
import hea from './header/header.vue'
import bann from './banner/bann.vue'
import feature from './feature/feature.vue'
import foot from './footer/footer.vue'
import login from './login/login.vue'
import enroll from './enroll/enroll.vue'
import { ref,computed  } from 'vue'
let showOverlay=ref(0);
const show = computed(() => {
  return showOverlay.value === 1 || showOverlay.value === 2;
});
const showlogin= computed(() => {
       return showOverlay.value === 1;
});
const showenroll= computed(() => {
       return showOverlay.value === 2;
});
</script>
<style>
*{
  margin: 0;
  padding: 0;
  user-select:none;
}
button:hover{
  background-color: rgba(255, 170, 0, 0.842);
  cursor: pointer;
}
.add{
   position: relative;
}
.overlay {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color:rgba(0, 0, 0, 0.5); /* 半透明黑色 */
  z-index: 999; /* 确保遮罩层在最顶层 */
}
</style>