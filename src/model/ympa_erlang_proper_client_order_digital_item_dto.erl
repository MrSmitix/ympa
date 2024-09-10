-module(ympa_erlang_proper_client_order_digital_item_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_digital_item_dto/0]).

-export([ympa_erlang_proper_client_order_digital_item_dto/1]).

-export_type([ympa_erlang_proper_client_order_digital_item_dto/0]).

-type ympa_erlang_proper_client_order_digital_item_dto() ::
  [ {'id', integer() }
  | {'code', binary() }
  | {'slip', binary() }
  | {'activate_till', date() }
  ].


ympa_erlang_proper_client_order_digital_item_dto() ->
    ympa_erlang_proper_client_order_digital_item_dto([]).

ympa_erlang_proper_client_order_digital_item_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'code', binary() }
            , {'slip', binary() }
            , {'activate_till', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

