import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
      path: '/user',
      name: 'User',
      component: () => import('@/views/user/User.vue')
  },
  {
      path: '/addUser',
      name: 'addUser',
      component: () => import('@/views/user/AddUser.vue')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
