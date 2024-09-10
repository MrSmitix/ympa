package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ChatsApiVerticle())
}

class ChatsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.ChatsApiImpl").newInstance() as ChatsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ChatsApi.address)
            .register(ChatsApi::class.java,instance)
    }
}