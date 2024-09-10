-module(ympa_erlang_proper_client_update_price_with_discount_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_price_with_discount_dto/0]).

-export([ympa_erlang_proper_client_update_price_with_discount_dto/1]).

-export_type([ympa_erlang_proper_client_update_price_with_discount_dto/0]).

-type ympa_erlang_proper_client_update_price_with_discount_dto() ::
  [ {'value', integer() }
  | {'currencyId', ympa_erlang_proper_client_currency_type:ympa_erlang_proper_client_currency_type() }
  | {'discountBase', integer() }
  ].


ympa_erlang_proper_client_update_price_with_discount_dto() ->
    ympa_erlang_proper_client_update_price_with_discount_dto([]).

ympa_erlang_proper_client_update_price_with_discount_dto(Fields) ->
  Default = [ {'value', integer() }
            , {'currencyId', ympa_erlang_proper_client_currency_type:ympa_erlang_proper_client_currency_type() }
            , {'discountBase', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

