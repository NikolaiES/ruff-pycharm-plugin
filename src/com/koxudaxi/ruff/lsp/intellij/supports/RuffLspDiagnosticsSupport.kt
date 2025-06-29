package com.koxudaxi.ruff.lsp.intellij.supports

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.customization.LspDiagnosticsSupport


@Suppress("UnstableApiUsage")
class RuffLspDiagnosticsSupport(val project: Project) : LspDiagnosticsSupport() {
    override fun shouldAskServerForDiagnostics(file: VirtualFile): Boolean = true
}