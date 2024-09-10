import { DynamicModule, Module, Global, Provider } from '@nestjs/common';
import { HttpModule, HttpService } from '@nestjs/axios';
import { AsyncConfiguration, Configuration, ConfigurationFactory } from './configuration';

import { BidsService } from './api/bids.service';
import { BusinessOfferMappingsService } from './api/businessOfferMappings.service';
import { BusinessesService } from './api/businesses.service';
import { CampaignsService } from './api/campaigns.service';
import { CategoriesService } from './api/categories.service';
import { ChatsService } from './api/chats.service';
import { ContentService } from './api/content.service';
import { DbsService } from './api/dbs.service';
import { DeliveryServicesService } from './api/deliveryServices.service';
import { ExpressService } from './api/express.service';
import { FbsService } from './api/fbs.service';
import { FbyService } from './api/fby.service';
import { FeedbacksService } from './api/feedbacks.service';
import { FeedsService } from './api/feeds.service';
import { GoodsFeedbackService } from './api/goodsFeedback.service';
import { GoodsStatsService } from './api/goodsStats.service';
import { HiddenOffersService } from './api/hiddenOffers.service';
import { ModelsService } from './api/models.service';
import { OfferMappingsService } from './api/offerMappings.service';
import { OffersService } from './api/offers.service';
import { OrderBusinessInformationService } from './api/orderBusinessInformation.service';
import { OrderDeliveryService } from './api/orderDelivery.service';
import { OrderLabelsService } from './api/orderLabels.service';
import { OrdersService } from './api/orders.service';
import { OrdersStatsService } from './api/ordersStats.service';
import { OutletLicensesService } from './api/outletLicenses.service';
import { OutletsService } from './api/outlets.service';
import { PriceQuarantineService } from './api/priceQuarantine.service';
import { PricesService } from './api/prices.service';
import { PromosService } from './api/promos.service';
import { RatingsService } from './api/ratings.service';
import { RegionsService } from './api/regions.service';
import { ReportsService } from './api/reports.service';
import { ReturnsService } from './api/returns.service';
import { ShipmentsService } from './api/shipments.service';
import { StocksService } from './api/stocks.service';
import { TariffsService } from './api/tariffs.service';
import { WarehousesService } from './api/warehouses.service';

@Global()
@Module({
  imports:      [ HttpModule ],
  exports:      [
    BidsService,
    BusinessOfferMappingsService,
    BusinessesService,
    CampaignsService,
    CategoriesService,
    ChatsService,
    ContentService,
    DbsService,
    DeliveryServicesService,
    ExpressService,
    FbsService,
    FbyService,
    FeedbacksService,
    FeedsService,
    GoodsFeedbackService,
    GoodsStatsService,
    HiddenOffersService,
    ModelsService,
    OfferMappingsService,
    OffersService,
    OrderBusinessInformationService,
    OrderDeliveryService,
    OrderLabelsService,
    OrdersService,
    OrdersStatsService,
    OutletLicensesService,
    OutletsService,
    PriceQuarantineService,
    PricesService,
    PromosService,
    RatingsService,
    RegionsService,
    ReportsService,
    ReturnsService,
    ShipmentsService,
    StocksService,
    TariffsService,
    WarehousesService
  ],
  providers: [
    BidsService,
    BusinessOfferMappingsService,
    BusinessesService,
    CampaignsService,
    CategoriesService,
    ChatsService,
    ContentService,
    DbsService,
    DeliveryServicesService,
    ExpressService,
    FbsService,
    FbyService,
    FeedbacksService,
    FeedsService,
    GoodsFeedbackService,
    GoodsStatsService,
    HiddenOffersService,
    ModelsService,
    OfferMappingsService,
    OffersService,
    OrderBusinessInformationService,
    OrderDeliveryService,
    OrderLabelsService,
    OrdersService,
    OrdersStatsService,
    OutletLicensesService,
    OutletsService,
    PriceQuarantineService,
    PricesService,
    PromosService,
    RatingsService,
    RegionsService,
    ReportsService,
    ReturnsService,
    ShipmentsService,
    StocksService,
    TariffsService,
    WarehousesService
  ]
})
export class ApiModule {
    public static forRoot(configurationFactory: () => Configuration): DynamicModule {
        return {
            module: ApiModule,
            providers: [ { provide: Configuration, useFactory: configurationFactory } ]
        };
    }

    /**
     * Register the module asynchronously.
     */
    static forRootAsync(options: AsyncConfiguration): DynamicModule {
        const providers = [...this.createAsyncProviders(options)];
        return {
            module: ApiModule,
            imports: options.imports || [],
            providers,
            exports: providers,
        };
    }

    private static createAsyncProviders(options: AsyncConfiguration): Provider[] {
        if (options.useClass) {
            return [
                this.createAsyncConfigurationProvider(options),
                {
                    provide: options.useClass,
                    useClass: options.useClass,
                },
            ];
        }
        return [this.createAsyncConfigurationProvider(options)];
    }

    private static createAsyncConfigurationProvider(
        options: AsyncConfiguration,
    ): Provider {
        if (options.useFactory) {
            return {
                provide: Configuration,
                useFactory: options.useFactory,
                inject: options.inject || [],
            };
        }
        return {
            provide: Configuration,
            useFactory: async (optionsFactory: ConfigurationFactory) =>
                await optionsFactory.createConfiguration(),
            inject: (options.useExisting && [options.useExisting]) || (options.useClass && [options.useClass]) || [],
        };
    }

    constructor( httpService: HttpService) { }
}
