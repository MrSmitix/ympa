-module(ympa_erlang_client_campaign_settings_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_campaign_settings_dto/0]).

-type ympa_erlang_client_campaign_settings_dto() ::
    #{ 'countryRegion' => integer(),
       'shopName' => binary(),
       'showInContext' => boolean(),
       'showInPremium' => boolean(),
       'useOpenStat' => boolean(),
       'localRegion' => ympa_erlang_client_campaign_settings_local_region_dto:ympa_erlang_client_campaign_settings_local_region_dto()
     }.

encode(#{ 'countryRegion' := CountryRegion,
          'shopName' := ShopName,
          'showInContext' := ShowInContext,
          'showInPremium' := ShowInPremium,
          'useOpenStat' := UseOpenStat,
          'localRegion' := LocalRegion
        }) ->
    #{ 'countryRegion' => CountryRegion,
       'shopName' => ShopName,
       'showInContext' => ShowInContext,
       'showInPremium' => ShowInPremium,
       'useOpenStat' => UseOpenStat,
       'localRegion' => LocalRegion
     }.
