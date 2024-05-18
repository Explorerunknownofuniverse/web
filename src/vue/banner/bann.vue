<!-- ParentComponent.vue -->
<template>
  <div>
    <!-- 第一个 banner 组件，传递不同的数据 -->
    <banner :m="message1" :h="heading1" :p="paragraph1" :boolmall="isMall1"/>
    
    <!-- 第二个 banner 组件，传递不同的数据 -->
    <banner :m="message2" :h="heading2" :p="paragraph2" :boolmall="isMall2"/>
  </div>
</template>

<script>
import banner from './banner.vue'
import msg01 from '@/resource/img-lab@2x.png'
import msg02 from '@/resource/img-screens@2x.png'
export default {
  components: {
    banner
  },
  data() {
    return {
      // 第一个 banner 的数据
      message1: msg01,
      heading1: "高级Web编程实验室",
      paragraph1: "每人拥有自己完全独立的编程实验室，内置所有基础软件及学习素材。打开浏览器，即刻开始编程！",
      isMall1: true,
      
      // 第二个 banner 的数据
      message2: msg02,
      heading2: "双屏学习",
      paragraph2: "双屏学习，小屏视频互动，大屏实际操作，学习无障碍。打开浏览器，即刻开始编程！",
      isMall2: false
    };
  }
};
</script>

<style>
</style>
