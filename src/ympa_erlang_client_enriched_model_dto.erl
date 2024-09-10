-module(ympa_erlang_client_enriched_model_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_enriched_model_dto/0]).

-type ympa_erlang_client_enriched_model_dto() ::
    #{ 'id' => integer(),
       'name' => binary(),
       'prices' => ympa_erlang_client_model_price_dto:ympa_erlang_client_model_price_dto(),
       'offers' => list(),
       'offlineOffers' => integer(),
       'onlineOffers' => integer()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'prices' := Prices,
          'offers' := Offers,
          'offlineOffers' := OfflineOffers,
          'onlineOffers' := OnlineOffers
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'prices' => Prices,
       'offers' => Offers,
       'offlineOffers' => OfflineOffers,
       'onlineOffers' => OnlineOffers
     }.
