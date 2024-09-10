-module(ympa_erlang_proper_client_get_offer_cards_content_status_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_offer_cards_content_status_request/0]).

-export([ympa_erlang_proper_client_get_offer_cards_content_status_request/1]).

-export_type([ympa_erlang_proper_client_get_offer_cards_content_status_request/0]).

-type ympa_erlang_proper_client_get_offer_cards_content_status_request() ::
  [ {'offerIds', list(binary()) }
  | {'cardStatuses', list(ympa_erlang_proper_client_offer_card_status_type:ympa_erlang_proper_client_offer_card_status_type()) }
  | {'categoryIds', list(integer()) }
  ].


ympa_erlang_proper_client_get_offer_cards_content_status_request() ->
    ympa_erlang_proper_client_get_offer_cards_content_status_request([]).

ympa_erlang_proper_client_get_offer_cards_content_status_request(Fields) ->
  Default = [ {'offerIds', list(binary()) }
            , {'cardStatuses', list(ympa_erlang_proper_client_offer_card_status_type:ympa_erlang_proper_client_offer_card_status_type()) }
            , {'categoryIds', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

