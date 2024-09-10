package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(FbyApiVerticle())
}

class FbyApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.FbyApiImpl").newInstance() as FbyApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(FbyApi.address)
            .register(FbyApi::class.java,instance)
    }
}