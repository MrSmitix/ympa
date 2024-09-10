package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(OrderBusinessInformationApiVerticle())
}

class OrderBusinessInformationApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.OrderBusinessInformationApiImpl").newInstance() as OrderBusinessInformationApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(OrderBusinessInformationApi.address)
            .register(OrderBusinessInformationApi::class.java,instance)
    }
}