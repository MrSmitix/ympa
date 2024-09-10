-module(ympa_erlang_client_get_orders_stats_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_orders_stats_request/0]).

-type ympa_erlang_client_get_orders_stats_request() ::
    #{ 'dateFrom' => calendar:date(),
       'dateTo' => calendar:date(),
       'updateFrom' => calendar:date(),
       'updateTo' => calendar:date(),
       'orders' => list(),
       'statuses' => list(),
       'hasCis' => boolean()
     }.

encode(#{ 'dateFrom' := DateFrom,
          'dateTo' := DateTo,
          'updateFrom' := UpdateFrom,
          'updateTo' := UpdateTo,
          'orders' := Orders,
          'statuses' := Statuses,
          'hasCis' := HasCis
        }) ->
    #{ 'dateFrom' => DateFrom,
       'dateTo' => DateTo,
       'updateFrom' => UpdateFrom,
       'updateTo' => UpdateTo,
       'orders' => Orders,
       'statuses' => Statuses,
       'hasCis' => HasCis
     }.
