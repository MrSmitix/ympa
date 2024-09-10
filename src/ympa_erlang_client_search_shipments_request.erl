-module(ympa_erlang_client_search_shipments_request).

-export([encode/1]).

-export_type([ympa_erlang_client_search_shipments_request/0]).

-type ympa_erlang_client_search_shipments_request() ::
    #{ 'dateFrom' := calendar:date(),
       'dateTo' := calendar:date(),
       'statuses' => ympa_erlang_client_set:ympa_erlang_client_set(),
       'orderIds' => ympa_erlang_client_set:ympa_erlang_client_set(),
       'cancelledOrders' => boolean()
     }.

encode(#{ 'dateFrom' := DateFrom,
          'dateTo' := DateTo,
          'statuses' := Statuses,
          'orderIds' := OrderIds,
          'cancelledOrders' := CancelledOrders
        }) ->
    #{ 'dateFrom' => DateFrom,
       'dateTo' => DateTo,
       'statuses' => Statuses,
       'orderIds' => OrderIds,
       'cancelledOrders' => CancelledOrders
     }.
