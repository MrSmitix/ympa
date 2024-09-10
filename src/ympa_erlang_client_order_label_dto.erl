-module(ympa_erlang_client_order_label_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_label_dto/0]).

-type ympa_erlang_client_order_label_dto() ::
    #{ 'orderId' := integer(),
       'placesNumber' := integer(),
       'url' := binary(),
       'parcelBoxLabels' := list()
     }.

encode(#{ 'orderId' := OrderId,
          'placesNumber' := PlacesNumber,
          'url' := Url,
          'parcelBoxLabels' := ParcelBoxLabels
        }) ->
    #{ 'orderId' => OrderId,
       'placesNumber' => PlacesNumber,
       'url' => Url,
       'parcelBoxLabels' => ParcelBoxLabels
     }.
