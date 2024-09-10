-module(ympa_erlang_client_order_delivery_dates_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_delivery_dates_dto/0]).

-type ympa_erlang_client_order_delivery_dates_dto() ::
    #{ 'fromDate' => binary(),
       'toDate' => binary(),
       'fromTime' => binary(),
       'toTime' => binary(),
       'realDeliveryDate' => binary()
     }.

encode(#{ 'fromDate' := FromDate,
          'toDate' := ToDate,
          'fromTime' := FromTime,
          'toTime' := ToTime,
          'realDeliveryDate' := RealDeliveryDate
        }) ->
    #{ 'fromDate' => FromDate,
       'toDate' => ToDate,
       'fromTime' => FromTime,
       'toTime' => ToTime,
       'realDeliveryDate' => RealDeliveryDate
     }.
