-module(ympa_erlang_proper_client_get_price_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_price_dto/0]).

-export([ympa_erlang_proper_client_get_price_dto/1]).

-export_type([ympa_erlang_proper_client_get_price_dto/0]).

-type ympa_erlang_proper_client_get_price_dto() ::
  [ {'value', integer() }
  | {'currencyId', ympa_erlang_proper_client_currency_type:ympa_erlang_proper_client_currency_type() }
  | {'updatedAt', datetime() }
  ].


ympa_erlang_proper_client_get_price_dto() ->
    ympa_erlang_proper_client_get_price_dto([]).

ympa_erlang_proper_client_get_price_dto(Fields) ->
  Default = [ {'value', integer() }
            , {'currencyId', ympa_erlang_proper_client_currency_type:ympa_erlang_proper_client_currency_type() }
            , {'updatedAt', datetime() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

