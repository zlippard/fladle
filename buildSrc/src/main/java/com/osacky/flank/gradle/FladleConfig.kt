package com.osacky.flank.gradle

interface FladleConfig {
  var flankVersion: String
  // Project id is automatically discovered by default. Use this to override the project id.
  var projectId: String?
  var serviceAccountCredentials: String?
  var useOrchestrator: Boolean
  var autoGoogleLogin: Boolean
  var devices: List<Map<String, String>>

  // https://cloud.google.com/sdk/gcloud/reference/firebase/test/android/run
  var testTargets: List<String>

  var testShards: Int?

  /**
   * shardTime - the amount of time tests within a shard should take
   * when set to > 0, the shard count is dynamically set based on time up to the maximmum limit defined by maxTestShards
   * 2 minutes (120) is recommended.
   * default: -1 (unlimited)
   */
  var shardTime: Int?

  var repeatTests: Int?

  var smartFlankGcsPath: String?

  var resultsHistoryName: String?

  var timeoutMin: Int

  var directoriesToPull: List<String>

  var filesToDownload: List<String>

  var environmentVariables: Map<String, String>

  var recordVideo: Boolean

  var performanceMetrics: Boolean

  // The number of times to retry failed tests. Default is 0. Max is 10.
  var flakyTestAttempts: Int

  var resultsBucket: String?

  var keepFilePath: Boolean
}
