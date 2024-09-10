-module(ympa_erlang_proper_client_order_delivery_date_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_delivery_date_dto/0]).

-export([ympa_erlang_proper_client_order_delivery_date_dto/1]).

-export_type([ympa_erlang_proper_client_order_delivery_date_dto/0]).

-type ympa_erlang_proper_client_order_delivery_date_dto() ::
  [ {'toDate', date() }
  ].


ympa_erlang_proper_client_order_delivery_date_dto() ->
    ympa_erlang_proper_client_order_delivery_date_dto([]).

ympa_erlang_proper_client_order_delivery_date_dto(Fields) ->
  Default = [ {'toDate', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

