-module(ympa_erlang_proper_client_price_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_price_dto/0]).

-export([ympa_erlang_proper_client_price_dto/1]).

-export_type([ympa_erlang_proper_client_price_dto/0]).

-type ympa_erlang_proper_client_price_dto() ::
  [ {'value', integer() }
  | {'discountBase', integer() }
  | {'currencyId', ympa_erlang_proper_client_currency_type:ympa_erlang_proper_client_currency_type() }
  | {'vat', integer() }
  ].


ympa_erlang_proper_client_price_dto() ->
    ympa_erlang_proper_client_price_dto([]).

ympa_erlang_proper_client_price_dto(Fields) ->
  Default = [ {'value', integer() }
            , {'discountBase', integer() }
            , {'currencyId', ympa_erlang_proper_client_currency_type:ympa_erlang_proper_client_currency_type() }
            , {'vat', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

