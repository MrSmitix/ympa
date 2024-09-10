-module(ympa_erlang_proper_client_offer_price_list_response_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_price_list_response_dto/0]).

-export([ympa_erlang_proper_client_offer_price_list_response_dto/1]).

-export_type([ympa_erlang_proper_client_offer_price_list_response_dto/0]).

-type ympa_erlang_proper_client_offer_price_list_response_dto() ::
  [ {'offers', list(ympa_erlang_proper_client_offer_price_response_dto:ympa_erlang_proper_client_offer_price_response_dto()) }
  | {'paging', ympa_erlang_proper_client_scrolling_pager_dto:ympa_erlang_proper_client_scrolling_pager_dto() }
  | {'total', integer() }
  ].


ympa_erlang_proper_client_offer_price_list_response_dto() ->
    ympa_erlang_proper_client_offer_price_list_response_dto([]).

ympa_erlang_proper_client_offer_price_list_response_dto(Fields) ->
  Default = [ {'offers', list(ympa_erlang_proper_client_offer_price_response_dto:ympa_erlang_proper_client_offer_price_response_dto()) }
            , {'paging', ympa_erlang_proper_client_scrolling_pager_dto:ympa_erlang_proper_client_scrolling_pager_dto() }
            , {'total', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

