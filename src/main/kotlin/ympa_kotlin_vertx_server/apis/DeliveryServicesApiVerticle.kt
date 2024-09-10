package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(DeliveryServicesApiVerticle())
}

class DeliveryServicesApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.DeliveryServicesApiImpl").newInstance() as DeliveryServicesApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(DeliveryServicesApi.address)
            .register(DeliveryServicesApi::class.java,instance)
    }
}