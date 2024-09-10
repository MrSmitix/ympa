namespace ympa_fsharp_giraffe_server.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open TestHelper
open ympa_fsharp_giraffe_server.GoodsFeedbackApiHandler
open ympa_fsharp_giraffe_server.GoodsFeedbackApiHandlerParams

module GoodsFeedbackApiHandlerTestsHelper =


  let mutable DeleteGoodsFeedbackCommentExamples = Map.empty
  let mutable DeleteGoodsFeedbackCommentBody = ""

  DeleteGoodsFeedbackCommentBody <- WebUtility.HtmlDecode "{
  &quot;id&quot; : 0
}"
  DeleteGoodsFeedbackCommentExamples <- DeleteGoodsFeedbackCommentExamples.Add("application/json", DeleteGoodsFeedbackCommentBody)

  let getDeleteGoodsFeedbackCommentExample mediaType =
    DeleteGoodsFeedbackCommentExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetGoodsFeedbackCommentsExamples = Map.empty
  let mutable GetGoodsFeedbackCommentsBody = ""

  GetGoodsFeedbackCommentsBody <- WebUtility.HtmlDecode "{
  &quot;feedbackId&quot; : 0
}"
  GetGoodsFeedbackCommentsExamples <- GetGoodsFeedbackCommentsExamples.Add("application/json", GetGoodsFeedbackCommentsBody)

  let getGetGoodsFeedbackCommentsExample mediaType =
    GetGoodsFeedbackCommentsExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetGoodsFeedbacksExamples = Map.empty
  let mutable GetGoodsFeedbacksBody = ""

  GetGoodsFeedbacksBody <- WebUtility.HtmlDecode "{
  &quot;dateTimeFrom&quot; : &quot;2000-01-23T04:56:07.000+00:00&quot;,
  &quot;ratingValues&quot; : [ 0, 0, 0, 0, 0 ],
  &quot;modelIds&quot; : [ 6, 6, 6, 6, 6 ],
  &quot;paid&quot; : true,
  &quot;reactionStatus&quot; : &quot;ALL&quot;,
  &quot;dateTimeTo&quot; : &quot;2000-01-23T04:56:07.000+00:00&quot;
}"
  GetGoodsFeedbacksExamples <- GetGoodsFeedbacksExamples.Add("application/json", GetGoodsFeedbacksBody)

  let getGetGoodsFeedbacksExample mediaType =
    GetGoodsFeedbacksExamples.[mediaType]
      |> getConverter mediaType

  let mutable SkipGoodsFeedbacksReactionExamples = Map.empty
  let mutable SkipGoodsFeedbacksReactionBody = ""

  SkipGoodsFeedbacksReactionBody <- WebUtility.HtmlDecode "{
  &quot;feedbackIds&quot; : [ null, null, null, null, null ]
}"
  SkipGoodsFeedbacksReactionExamples <- SkipGoodsFeedbacksReactionExamples.Add("application/json", SkipGoodsFeedbacksReactionBody)

  let getSkipGoodsFeedbacksReactionExample mediaType =
    SkipGoodsFeedbacksReactionExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdateGoodsFeedbackCommentExamples = Map.empty
  let mutable UpdateGoodsFeedbackCommentBody = ""

  UpdateGoodsFeedbackCommentBody <- WebUtility.HtmlDecode "{
  &quot;feedbackId&quot; : 0,
  &quot;comment&quot; : {
    &quot;id&quot; : 6,
    &quot;text&quot; : &quot;text&quot;,
    &quot;parentId&quot; : 1
  }
}"
  UpdateGoodsFeedbackCommentExamples <- UpdateGoodsFeedbackCommentExamples.Add("application/json", UpdateGoodsFeedbackCommentBody)

  let getUpdateGoodsFeedbackCommentExample mediaType =
    UpdateGoodsFeedbackCommentExamples.[mediaType]
      |> getConverter mediaType
