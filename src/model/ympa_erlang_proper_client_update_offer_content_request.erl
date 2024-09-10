-module(ympa_erlang_proper_client_update_offer_content_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_offer_content_request/0]).

-export([ympa_erlang_proper_client_update_offer_content_request/1]).

-export_type([ympa_erlang_proper_client_update_offer_content_request/0]).

-type ympa_erlang_proper_client_update_offer_content_request() ::
  [ {'offersContent', list(ympa_erlang_proper_client_offer_content_dto:ympa_erlang_proper_client_offer_content_dto()) }
  ].


ympa_erlang_proper_client_update_offer_content_request() ->
    ympa_erlang_proper_client_update_offer_content_request([]).

ympa_erlang_proper_client_update_offer_content_request(Fields) ->
  Default = [ {'offersContent', list(ympa_erlang_proper_client_offer_content_dto:ympa_erlang_proper_client_offer_content_dto(), 1, 100) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

