package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(GoodsFeedbackApiVerticle())
}

class GoodsFeedbackApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.GoodsFeedbackApiImpl").newInstance() as GoodsFeedbackApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(GoodsFeedbackApi.address)
            .register(GoodsFeedbackApi::class.java,instance)
    }
}