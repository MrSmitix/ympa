package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(WarehousesApiVerticle())
}

class WarehousesApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.WarehousesApiImpl").newInstance() as WarehousesApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(WarehousesApi.address)
            .register(WarehousesApi::class.java,instance)
    }
}