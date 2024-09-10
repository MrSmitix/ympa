-module(ympa_erlang_proper_client_feedback_comment_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feedback_comment_dto/0]).

-export([ympa_erlang_proper_client_feedback_comment_dto/1]).

-export_type([ympa_erlang_proper_client_feedback_comment_dto/0]).

-type ympa_erlang_proper_client_feedback_comment_dto() ::
  [ {'id', integer() }
  | {'parentId', integer() }
  | {'body', binary() }
  | {'createdAt', datetime() }
  | {'updatedAt', datetime() }
  | {'author', ympa_erlang_proper_client_feedback_comment_author_dto:ympa_erlang_proper_client_feedback_comment_author_dto() }
  | {'children', list(ympa_erlang_proper_client_feedback_comment_dto:ympa_erlang_proper_client_feedback_comment_dto()) }
  ].


ympa_erlang_proper_client_feedback_comment_dto() ->
    ympa_erlang_proper_client_feedback_comment_dto([]).

ympa_erlang_proper_client_feedback_comment_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'parentId', integer() }
            , {'body', binary() }
            , {'createdAt', datetime() }
            , {'updatedAt', datetime() }
            , {'author', ympa_erlang_proper_client_feedback_comment_author_dto:ympa_erlang_proper_client_feedback_comment_author_dto() }
            , {'children', list(ympa_erlang_proper_client_feedback_comment_dto:ympa_erlang_proper_client_feedback_comment_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

