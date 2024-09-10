-module(ympa_erlang_proper_client_offer_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_dto/0]).

-export([ympa_erlang_proper_client_offer_dto/1]).

-export_type([ympa_erlang_proper_client_offer_dto/0]).

-type ympa_erlang_proper_client_offer_dto() ::
  [ {'price', integer() }
  | {'feedId', integer() }
  | {'id', binary() }
  | {'shopCategoryId', binary() }
  | {'marketCategoryId', integer() }
  | {'preDiscountPrice', integer() }
  | {'discount', integer() }
  | {'cutPrice', boolean() }
  | {'url', binary() }
  | {'modelId', integer() }
  | {'name', binary() }
  | {'currency', ympa_erlang_proper_client_currency_type:ympa_erlang_proper_client_currency_type() }
  | {'bid', integer() }
  | {'cbid', integer() }
  | {'fee', integer() }
  | {'blocked', boolean() }
  ].


ympa_erlang_proper_client_offer_dto() ->
    ympa_erlang_proper_client_offer_dto([]).

ympa_erlang_proper_client_offer_dto(Fields) ->
  Default = [ {'price', integer() }
            , {'feedId', integer() }
            , {'id', binary() }
            , {'shopCategoryId', binary() }
            , {'marketCategoryId', integer() }
            , {'preDiscountPrice', integer() }
            , {'discount', integer() }
            , {'cutPrice', boolean() }
            , {'url', binary() }
            , {'modelId', integer() }
            , {'name', binary() }
            , {'currency', ympa_erlang_proper_client_currency_type:ympa_erlang_proper_client_currency_type() }
            , {'bid', integer() }
            , {'cbid', integer() }
            , {'fee', integer() }
            , {'blocked', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

