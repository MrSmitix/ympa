-module(ympa_erlang_proper_client_offer_cards_content_status_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_cards_content_status_dto/0]).

-export([ympa_erlang_proper_client_offer_cards_content_status_dto/1]).

-export_type([ympa_erlang_proper_client_offer_cards_content_status_dto/0]).

-type ympa_erlang_proper_client_offer_cards_content_status_dto() ::
  [ {'offerCards', list(ympa_erlang_proper_client_offer_card_dto:ympa_erlang_proper_client_offer_card_dto()) }
  | {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
  ].


ympa_erlang_proper_client_offer_cards_content_status_dto() ->
    ympa_erlang_proper_client_offer_cards_content_status_dto([]).

ympa_erlang_proper_client_offer_cards_content_status_dto(Fields) ->
  Default = [ {'offerCards', list(ympa_erlang_proper_client_offer_card_dto:ympa_erlang_proper_client_offer_card_dto()) }
            , {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

