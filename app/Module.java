import com.google.inject.AbstractModule;

import controllers.*;
import openapitools.SecurityAPIUtils;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(BidsApiControllerImpInterface.class).to(BidsApiControllerImp.class);
        bind(BusinessOfferMappingsApiControllerImpInterface.class).to(BusinessOfferMappingsApiControllerImp.class);
        bind(BusinessesApiControllerImpInterface.class).to(BusinessesApiControllerImp.class);
        bind(CampaignsApiControllerImpInterface.class).to(CampaignsApiControllerImp.class);
        bind(CategoriesApiControllerImpInterface.class).to(CategoriesApiControllerImp.class);
        bind(ChatsApiControllerImpInterface.class).to(ChatsApiControllerImp.class);
        bind(ContentApiControllerImpInterface.class).to(ContentApiControllerImp.class);
        bind(DbsApiControllerImpInterface.class).to(DbsApiControllerImp.class);
        bind(DeliveryServicesApiControllerImpInterface.class).to(DeliveryServicesApiControllerImp.class);
        bind(ExpressApiControllerImpInterface.class).to(ExpressApiControllerImp.class);
        bind(FbsApiControllerImpInterface.class).to(FbsApiControllerImp.class);
        bind(FbyApiControllerImpInterface.class).to(FbyApiControllerImp.class);
        bind(FeedbacksApiControllerImpInterface.class).to(FeedbacksApiControllerImp.class);
        bind(FeedsApiControllerImpInterface.class).to(FeedsApiControllerImp.class);
        bind(GoodsFeedbackApiControllerImpInterface.class).to(GoodsFeedbackApiControllerImp.class);
        bind(GoodsStatsApiControllerImpInterface.class).to(GoodsStatsApiControllerImp.class);
        bind(HiddenOffersApiControllerImpInterface.class).to(HiddenOffersApiControllerImp.class);
        bind(ModelsApiControllerImpInterface.class).to(ModelsApiControllerImp.class);
        bind(OfferMappingsApiControllerImpInterface.class).to(OfferMappingsApiControllerImp.class);
        bind(OffersApiControllerImpInterface.class).to(OffersApiControllerImp.class);
        bind(OrderBusinessInformationApiControllerImpInterface.class).to(OrderBusinessInformationApiControllerImp.class);
        bind(OrderDeliveryApiControllerImpInterface.class).to(OrderDeliveryApiControllerImp.class);
        bind(OrderLabelsApiControllerImpInterface.class).to(OrderLabelsApiControllerImp.class);
        bind(OrdersApiControllerImpInterface.class).to(OrdersApiControllerImp.class);
        bind(OrdersStatsApiControllerImpInterface.class).to(OrdersStatsApiControllerImp.class);
        bind(OutletLicensesApiControllerImpInterface.class).to(OutletLicensesApiControllerImp.class);
        bind(OutletsApiControllerImpInterface.class).to(OutletsApiControllerImp.class);
        bind(PriceQuarantineApiControllerImpInterface.class).to(PriceQuarantineApiControllerImp.class);
        bind(PricesApiControllerImpInterface.class).to(PricesApiControllerImp.class);
        bind(PromosApiControllerImpInterface.class).to(PromosApiControllerImp.class);
        bind(RatingsApiControllerImpInterface.class).to(RatingsApiControllerImp.class);
        bind(RegionsApiControllerImpInterface.class).to(RegionsApiControllerImp.class);
        bind(ReportsApiControllerImpInterface.class).to(ReportsApiControllerImp.class);
        bind(ReturnsApiControllerImpInterface.class).to(ReturnsApiControllerImp.class);
        bind(ShipmentsApiControllerImpInterface.class).to(ShipmentsApiControllerImp.class);
        bind(StocksApiControllerImpInterface.class).to(StocksApiControllerImp.class);
        bind(TariffsApiControllerImpInterface.class).to(TariffsApiControllerImp.class);
        bind(WarehousesApiControllerImpInterface.class).to(WarehousesApiControllerImp.class);
        bind(SecurityAPIUtils.class);
    }
}