-module(ympa_erlang_proper_client_offer_processing_note_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_processing_note_type/0]).

-export_type([ympa_erlang_proper_client_offer_processing_note_type/0]).

-type ympa_erlang_proper_client_offer_processing_note_type() ::
  binary().

ympa_erlang_proper_client_offer_processing_note_type() ->
  elements([<<"ASSORTMENT">>, <<"CANCELLED">>, <<"CONFLICTING_INFORMATION">>, <<"OTHER">>, <<"DEPARTMENT_FROZEN">>, <<"INCORRECT_INFORMATION">>, <<"LEGAL_CONFLICT">>, <<"NEED_CLASSIFICATION_INFORMATION">>, <<"NEED_INFORMATION">>, <<"NEED_PICTURES">>, <<"NEED_VENDOR">>, <<"NO_CATEGORY">>, <<"NO_KNOWLEDGE">>, <<"NO_PARAMETERS_IN_SHOP_TITLE">>, <<"NO_SIZE_MEASURE">>, <<"SAMPLE_LINE">>]).

