package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(OrderLabelsApiVerticle())
}

class OrderLabelsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.OrderLabelsApiImpl").newInstance() as OrderLabelsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(OrderLabelsApi.address)
            .register(OrderLabelsApi::class.java,instance)
    }
}