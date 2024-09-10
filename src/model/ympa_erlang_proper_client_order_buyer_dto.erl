-module(ympa_erlang_proper_client_order_buyer_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_buyer_dto/0]).

-export([ympa_erlang_proper_client_order_buyer_dto/1]).

-export_type([ympa_erlang_proper_client_order_buyer_dto/0]).

-type ympa_erlang_proper_client_order_buyer_dto() ::
  [ {'id', binary() }
  | {'lastName', binary() }
  | {'firstName', binary() }
  | {'middleName', binary() }
  | {'type', ympa_erlang_proper_client_order_buyer_type:ympa_erlang_proper_client_order_buyer_type() }
  ].


ympa_erlang_proper_client_order_buyer_dto() ->
    ympa_erlang_proper_client_order_buyer_dto([]).

ympa_erlang_proper_client_order_buyer_dto(Fields) ->
  Default = [ {'id', binary() }
            , {'lastName', binary() }
            , {'firstName', binary() }
            , {'middleName', binary() }
            , {'type', ympa_erlang_proper_client_order_buyer_type:ympa_erlang_proper_client_order_buyer_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

