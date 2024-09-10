package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(PriceQuarantineApiVerticle())
}

class PriceQuarantineApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.PriceQuarantineApiImpl").newInstance() as PriceQuarantineApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(PriceQuarantineApi.address)
            .register(PriceQuarantineApi::class.java,instance)
    }
}