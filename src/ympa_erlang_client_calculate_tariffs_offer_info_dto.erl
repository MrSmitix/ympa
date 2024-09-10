-module(ympa_erlang_client_calculate_tariffs_offer_info_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_calculate_tariffs_offer_info_dto/0]).

-type ympa_erlang_client_calculate_tariffs_offer_info_dto() ::
    #{ 'offer' := ympa_erlang_client_calculate_tariffs_offer_dto:ympa_erlang_client_calculate_tariffs_offer_dto(),
       'tariffs' := list()
     }.

encode(#{ 'offer' := Offer,
          'tariffs' := Tariffs
        }) ->
    #{ 'offer' => Offer,
       'tariffs' => Tariffs
     }.
