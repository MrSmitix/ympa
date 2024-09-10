package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ShipmentsApiVerticle())
}

class ShipmentsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.ShipmentsApiImpl").newInstance() as ShipmentsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ShipmentsApi.address)
            .register(ShipmentsApi::class.java,instance)
    }
}