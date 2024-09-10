-module(ympa_erlang_proper_client_update_offer_content_result_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_offer_content_result_dto/0]).

-export([ympa_erlang_proper_client_update_offer_content_result_dto/1]).

-export_type([ympa_erlang_proper_client_update_offer_content_result_dto/0]).

-type ympa_erlang_proper_client_update_offer_content_result_dto() ::
  [ {'offerId', binary() }
  | {'errors', list(ympa_erlang_proper_client_offer_content_error_dto:ympa_erlang_proper_client_offer_content_error_dto()) }
  | {'warnings', list(ympa_erlang_proper_client_offer_content_error_dto:ympa_erlang_proper_client_offer_content_error_dto()) }
  ].


ympa_erlang_proper_client_update_offer_content_result_dto() ->
    ympa_erlang_proper_client_update_offer_content_result_dto([]).

ympa_erlang_proper_client_update_offer_content_result_dto(Fields) ->
  Default = [ {'offerId', binary(1, 255) }
            , {'errors', list(ympa_erlang_proper_client_offer_content_error_dto:ympa_erlang_proper_client_offer_content_error_dto()) }
            , {'warnings', list(ympa_erlang_proper_client_offer_content_error_dto:ympa_erlang_proper_client_offer_content_error_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

