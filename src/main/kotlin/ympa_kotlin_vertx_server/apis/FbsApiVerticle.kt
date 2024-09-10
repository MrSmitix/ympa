package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(FbsApiVerticle())
}

class FbsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.FbsApiImpl").newInstance() as FbsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(FbsApi.address)
            .register(FbsApi::class.java,instance)
    }
}