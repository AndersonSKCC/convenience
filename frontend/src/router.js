
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReservationManager from "./components/ReservationManager"

import PayHistoryManager from "./components/PayHistoryManager"

import ProductManager from "./components/ProductManager"
import StoreReservationManager from "./components/StoreReservationManager"


import Dashboard from "./components/Dashboard"
import StockManager from "./components/StockManager"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reservations',
                name: 'ReservationManager',
                component: ReservationManager
            },

            {
                path: '/payHistories',
                name: 'PayHistoryManager',
                component: PayHistoryManager
            },

            {
                path: '/products',
                name: 'ProductManager',
                component: ProductManager
            },
            {
                path: '/storeReservations',
                name: 'StoreReservationManager',
                component: StoreReservationManager
            },


            {
                path: '/dashboards',
                name: 'Dashboard',
                component: Dashboard
            },
            {
                path: '/stocks',
                name: 'StockManager',
                component: StockManager
            },



    ]
})
