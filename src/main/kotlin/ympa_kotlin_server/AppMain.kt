package ympa_kotlin_server

import io.ktor.server.application.*
import io.ktor.serialization.gson.*
import io.ktor.http.*
import io.ktor.server.resources.*
import io.ktor.server.plugins.autohead.*
import io.ktor.server.plugins.compression.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.defaultheaders.*
import io.ktor.server.plugins.hsts.*
import com.codahale.metrics.Slf4jReporter
import io.ktor.server.metrics.dropwizard.*
import java.util.concurrent.TimeUnit
import io.ktor.server.routing.*
import com.typesafe.config.ConfigFactory
import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.server.config.HoconApplicationConfig
import io.ktor.server.auth.*
import org.openapitools.server.infrastructure.*
import ympa_kotlin_server.apis.BidsApi
import ympa_kotlin_server.apis.BusinessOfferMappingsApi
import ympa_kotlin_server.apis.BusinessesApi
import ympa_kotlin_server.apis.CampaignsApi
import ympa_kotlin_server.apis.CategoriesApi
import ympa_kotlin_server.apis.ChatsApi
import ympa_kotlin_server.apis.ContentApi
import ympa_kotlin_server.apis.DbsApi
import ympa_kotlin_server.apis.DeliveryServicesApi
import ympa_kotlin_server.apis.ExpressApi
import ympa_kotlin_server.apis.FbsApi
import ympa_kotlin_server.apis.FbyApi
import ympa_kotlin_server.apis.FeedbacksApi
import ympa_kotlin_server.apis.FeedsApi
import ympa_kotlin_server.apis.GoodsFeedbackApi
import ympa_kotlin_server.apis.GoodsStatsApi
import ympa_kotlin_server.apis.HiddenOffersApi
import ympa_kotlin_server.apis.ModelsApi
import ympa_kotlin_server.apis.OfferMappingsApi
import ympa_kotlin_server.apis.OffersApi
import ympa_kotlin_server.apis.OrderBusinessInformationApi
import ympa_kotlin_server.apis.OrderDeliveryApi
import ympa_kotlin_server.apis.OrderLabelsApi
import ympa_kotlin_server.apis.OrdersApi
import ympa_kotlin_server.apis.OrdersStatsApi
import ympa_kotlin_server.apis.OutletLicensesApi
import ympa_kotlin_server.apis.OutletsApi
import ympa_kotlin_server.apis.PriceQuarantineApi
import ympa_kotlin_server.apis.PricesApi
import ympa_kotlin_server.apis.PromosApi
import ympa_kotlin_server.apis.RatingsApi
import ympa_kotlin_server.apis.RegionsApi
import ympa_kotlin_server.apis.ReportsApi
import ympa_kotlin_server.apis.ReturnsApi
import ympa_kotlin_server.apis.ShipmentsApi
import ympa_kotlin_server.apis.StocksApi
import ympa_kotlin_server.apis.TariffsApi
import ympa_kotlin_server.apis.WarehousesApi


internal val settings = HoconApplicationConfig(ConfigFactory.defaultApplication(HTTP::class.java.classLoader))

object HTTP {
    val client = HttpClient(Apache)
}

fun Application.main() {
    install(DefaultHeaders)
    install(DropwizardMetrics) {
        val reporter = Slf4jReporter.forRegistry(registry)
            .outputTo(this@main.log)
            .convertRatesTo(TimeUnit.SECONDS)
            .convertDurationsTo(TimeUnit.MILLISECONDS)
            .build()
        reporter.start(10, TimeUnit.SECONDS)
    }
    install(ContentNegotiation) {
        register(ContentType.Application.Json, GsonConverter())
    }
    install(AutoHeadResponse) // see https://ktor.io/docs/autoheadresponse.html
    install(Compression, ApplicationCompressionConfiguration()) // see https://ktor.io/docs/compression.html
    install(HSTS, ApplicationHstsConfiguration()) // see https://ktor.io/docs/hsts.html
    install(Resources)
    install(Authentication) {
        oauth("OAuth") {
            client = HttpClient(Apache)
            providerLookup = { applicationAuthProvider(this@main.environment.config) }
            urlProvider = { _ ->
                // TODO: define a callback url here.
                "/"
            }
        }
    }
    install(Routing) {
        BidsApi()
        BusinessOfferMappingsApi()
        BusinessesApi()
        CampaignsApi()
        CategoriesApi()
        ChatsApi()
        ContentApi()
        DbsApi()
        DeliveryServicesApi()
        ExpressApi()
        FbsApi()
        FbyApi()
        FeedbacksApi()
        FeedsApi()
        GoodsFeedbackApi()
        GoodsStatsApi()
        HiddenOffersApi()
        ModelsApi()
        OfferMappingsApi()
        OffersApi()
        OrderBusinessInformationApi()
        OrderDeliveryApi()
        OrderLabelsApi()
        OrdersApi()
        OrdersStatsApi()
        OutletLicensesApi()
        OutletsApi()
        PriceQuarantineApi()
        PricesApi()
        PromosApi()
        RatingsApi()
        RegionsApi()
        ReportsApi()
        ReturnsApi()
        ShipmentsApi()
        StocksApi()
        TariffsApi()
        WarehousesApi()
    }

}
