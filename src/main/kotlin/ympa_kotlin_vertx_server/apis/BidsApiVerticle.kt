package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(BidsApiVerticle())
}

class BidsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.BidsApiImpl").newInstance() as BidsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(BidsApi.address)
            .register(BidsApi::class.java,instance)
    }
}