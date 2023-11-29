package com.sopa.projectevideoappdiaz


import java.net.URISyntaxException
import io.socket.client.IO
import io.socket.client.Socket
object Socket {
    lateinit var mSocket: Socket
    @Synchronized
    fun setSocket(){
        try {
            mSocket= IO.socket("http://192.168.56.1:8888")
        }catch (e: URISyntaxException){
            e.printStackTrace()
        }
    }
    @Synchronized
    fun getSocket(): Socket{
        return mSocket
    }
    @Synchronized
    fun connection() {
        mSocket.connect()
    }
    @Synchronized
    fun closeConnection(){
        mSocket.disconnect()
    }


}