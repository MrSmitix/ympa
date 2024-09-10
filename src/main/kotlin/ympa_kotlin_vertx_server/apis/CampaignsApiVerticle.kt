package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(CampaignsApiVerticle())
}

class CampaignsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.CampaignsApiImpl").newInstance() as CampaignsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(CampaignsApi.address)
            .register(CampaignsApi::class.java,instance)
    }
}